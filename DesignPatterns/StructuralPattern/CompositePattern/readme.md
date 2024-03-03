# Composite Pattern: Building and Room Example

## Introduction

The Composite pattern is a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It enables clients to treat individual objects and compositions of objects uniformly.

In this example, we'll explore how the Composite pattern can be used to model buildings and rooms. A building can contain multiple rooms, and each room is a leaf node in the composite structure.

## Components

### 1. Component: Building

- The `Building` class represents the composite object in the composite structure.
- It implements the `CompositeComponent` interface, which defines operations for adding and removing child components (rooms).
- The `Building` class maintains a collection of child components (rooms) and provides methods to manage them.

### 2. Leaf: Room

- The `Room` class represents the leaf node in the composite structure.
- It implements the `CompositeComponent` interface, which defines operations for adding and removing child components (not applicable for leaf nodes).
- The `Room` class does not have child components, as it is a leaf node. It provides methods to access and manage room-specific attributes.

## Example Usage

```java
public interface CompositeComponent {
    void addComponent(CompositeComponent component);
    void removeComponent(CompositeComponent component);
}

public class Building implements CompositeComponent {
    // Implementation details...
}

public class Room implements CompositeComponent {
    // Implementation details...
}
## Conclusion

The Composite pattern is a powerful design pattern that allows you to represent complex hierarchical structures in a uniform manner. In this example, we demonstrated how to use the Composite pattern to model buildings and rooms, where a building can contain multiple rooms, and each room is a leaf node in the composite structure. This pattern promotes code reusability, flexibility, and scalability in object-oriented design.