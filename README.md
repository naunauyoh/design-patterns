# design-patterns

a study of design pattern idiomatic implementation in modern renditions of languages for McGill COMP 303


## Table of Which Patterns Apply to Which Languages

Applies indicates the pattern is useful for the languages.
Feature indicates the pattern is built into the language as an equal or more powerful abstraction.

| Design Pattern          | Java                              | Lisp                               | Haskell               | C++                   |
|-------------------------|-----------------------------------|------------------------------------|-----------------------|-----------------------|
| Iterator                | Applies (Java 8+ HOF with Stream) | HOF                                | HOF                   | HOF                   |
| Observer                | Applies                           | Reorientation (Method Combination) | Applies (as Monad)    | Applies               |
| Strategy                | Applies                           | HOF                                | HOF                   | HOF                   |
| Composite               | Applies                           | Applies                            | Algebraic Data Types  | Tagged Union?         |
| Decorator/Adapter       | Applies                           | Dynamic Objects                    | Applies?              | Applies?              |
| Command                 | Applies (sort of)                 | Closures, First Class Functions    | First Class Functions | First Class Functions |
| Factory Method          | Applies                           | First Class Types                  | First Class Types     | Applies Poorly        |
| Proxy                   | Applies Poorly                    | First Class Types                  | First Class Types     | Applies Poorly        |
| Singleton               | Applies?                          | Applies?                           | Applies?              | Applies?              |
| Visitor                 | Applies?                          | Applies?                           | Applies?              | Applies?              |
| Bridge                  | Applies Poorly                    | Metaprogramming                    | Applies Poorly        | Applies Poorly        |
| Chain of Responsibility | Applies                           | So many alternatives....           | Many alternatives     | Many alternatives     |
| Mediator                | Applies                           | Reorientation (Method Combination) | Applies               | Applies               |
|                         |                                   |                                    |                       |                       |
