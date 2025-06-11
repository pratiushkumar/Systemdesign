Java enforces that overridden methods do not throw checked exceptions that are broader than those declared in the base class. 
This ensures that client code handling the base class’s exceptions can still handle the subclass without unexpected errors.

 Exception Rule 
○ The subclass may throw fewer or more specific exceptions than the parent, but 
never broader exceptions that the client is not expecting. 
○ Example: If the parent method declares it throws RuntimeError, the child can 
throw IndexOutOfBoundsException (a subtype) but not a totally unrelated 
exception like OutOfMemoryError if it isn’t within that hierarchy.

LOGICAL ERROR AGAR BASE CLASS THROW KAR RAHA HAI TO CHILD CLASS KO BHI LOGICAL ERROR KA KOI ERROR THROW KARNA HOGA WO RUNTIME ERROR THROW NAHI KAR SAKTA
