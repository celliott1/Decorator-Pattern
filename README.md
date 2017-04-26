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
  
