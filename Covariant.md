Since Java 5, covariant return types are supported, allowing a subclass to return a more specific type than the base class method. This aligns with LSP by ensuring the returned object is substitutable.

The subclass’s return type must be the same as the parent’s, or narrower (a 
subtype). 
0 Covariant returns are allowed (e.g., parent returns Animal; child can return 
Dog), but not contravariant (e.g., child cannot return Object if the parent returns 
Animal).

                                       like we returning an engine engine
                                                |
                                                |
                                        now we wil specify what type of engine like four wheeler engine
                                                |
                                                |
                                        in next class we will specify name of that four wheeler with engine(like car,truck 
                                                |
                                                |
                                        in next class we will specify type whether its elctric,diesel based or petrol based and will return it 
                                                
