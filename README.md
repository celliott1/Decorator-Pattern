# Decorator-Pattern
Implementation of the Decorator Pattern

Definition:
- Allows for the dynamic wrapping of objects in order to modify their existing responsibilities and behaviours.

Used when:
- Object responsibilities and behaviours need to be dynamically modifiable.
- Concrete implementations need to be decoupled from responsibilities and behaviours.

Implementation:
- The Yogurt interface implements the getDescription and getPrice methods.
- Then a decorator is created which wraps the base interface with added functionality. This is modeled as an abstract class to maintain a   reference to the interace, Yogurt. 
- The rest of the classes extend YogurtDecorator to perform actions on the object at hand. 
  
- The Decorator Pattern allows one to dynamically add additional attributes to objects. The yogurt class is the base interface that defines the methods of the object and the yogurt decorator class allows for the creation of additional objects for the plainyogurt class. This allows for the decoupling of concrete implementations and their responsibilities/behaviors. 
