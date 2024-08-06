/**
 * A simple IoC container that uses a map to store mappings between interfaces
 * and their implementations.
 * It provides methods to register mappings, create instances of interfaces, and
 * retrieve instances of interfaces.
 */
// IoC containers exercise
 //While we've now decoupled our code, we still have to create instances of our interfaces using multiple factory classes. In a real-world application with numerous interfaces defined, this can quickly become a maintenance nightmare. To address this, we can use a IoC Container to manage our dependencies.

// Examine the SimpleContainer class. It may contain code that looks unfamiliar, but focus on the comments describing the behaviour of the register and create methods.
// 1. Add the following method to the App class:
//     private static SimpleContainer initialiseContainer() {
//         SimpleContainer container = new SimpleContainer();

//         // Register mappings for any required interfaces with their concrete implementations

//         return container;
//     }
// 1. Modify the initialiseContainer method to register mappings for the Game and Player interfaces with their concrete implementations in the container, e.g. container.register(Game.class, DiceGame.class)
// 2. Add a call to initialiseContainer in the main method of App, before any factory method calls.
// 3. Replace the call to GameFactory.create() with container.get(Game.class)
// 4. Remove the calls to PlayerFactory.create()
// 5. Run the application again to confirm you get the same output as before.
// By using a container, we're able to simplify our code and eliminate the need for multiple factory classes. This makes our code more modular, maintainable and easier to understand.

package com.cbfacademy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SimpleContainer {
    private final Map<Class<?>, Class<?>> types;

    /**
     * Constructs a new container with an empty map.
     */
    public SimpleContainer() {
        this(new HashMap<>());
    }

    /**
     * Constructs a new container with the provided map.
     *
     * @param types The map to be used for storing mappings.
     */
    public SimpleContainer(Map<Class<?>, Class<?>> types) {
        this.types = types;
    }
    /**
     * Register a mapping between an interface and its implementation.
     *
     * @param interfaceType      The interface type to be registered.
     * @param implementationType The implementation type to be registered.
     */
    public <TInterface, TImplementation extends TInterface> void register(Class<TInterface> interfaceType,
            Class<TImplementation> implementationType) {
        types.put(interfaceType, implementationType);
    }

    /**
     * Get a concrete instance of the specified interface type.
     * The implementation type is determined by the interface type and the
     * registered mappings.
     * 
     * @param interfaceType The interface type to be created.
     * @return An instance of the specified interface type.
     */
    public <TInterface> TInterface get(Class<TInterface> interfaceType) {
        return interfaceType.cast(createInstanceOf(types.get(interfaceType)));
    }

    private Object createInstanceOf(Class<?> type) {
        try {
            Constructor<?> constructor = type.getConstructors()[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameters = new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                parameters[i] = get(parameterTypes[i]);
            }

            return constructor.newInstance(parameters);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to create instance of type: " + type.getName(), e);
        }
    }
}
