 Why LSP “Breaks” Often 
● Inheritance ensures that subclasses have the same methods, but not necessarily the 
same behavior or contractual guarantees. 
● Without clear rules, a subclass may override a method incorrectly (e.g., throwing 
unexpected exceptions, changing return values or method signatures), causing client 
code to fail.

Three Categories of LSP Rules 
LSP compliance hinges on three broad categories of rules, each with sub-rules: 
1. Signature Rules 
2. Property Rules 
3. Method Rules
