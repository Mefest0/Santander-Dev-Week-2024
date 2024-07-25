# Santander DEV Week 2024
Java RESTfull API Criada para a Santander DEV Week 2024.

## Diagrama de Classes

```mermaid
classDiagram
class User {
+String name
+Account account
+List<Feature> features
+Card card
+List<News> news
}

class Account {
  +String Number
  +String Agency
  +Double Balance
  +Double Limit
}

class Feature {
  +String icon
  +String description
}

class Card {
  +String Number
  +Double limit
}

class News {
  +String icon
  +String description
}

User "1" *-- "1" Account
User "1" *-- "N" Feature
User "1" *-- "1" Card
User "1" *-- "N" News
```
