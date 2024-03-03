# Simple Banking System using Facade Pattern

The Facade pattern is a design pattern that simplifies the interface to a complex subsystem by providing a unified wrapper called a facade class. It hides the complexity of the subsystem and provides a simplified interface for client classes, reducing coupling between the subsystem and the clients.

## Explanation

Suppose we have a simple banking system with two main subsystem classes:

- **Account**: Represents a bank account with functionalities like depositing and withdrawing money.
- **Customer**: Represents a bank customer with a name.

To simplify the interaction with the banking system, we can introduce a facade class called `BankFacade`. The `BankFacade` class acts as a unified interface to the banking system and hides the complexities of managing accounts and customers.

The `BankFacade` class encapsulates the interactions with the subsystem classes (`Account` and `Customer`) and provides simplified methods for common banking operations such as creating an account, depositing money, withdrawing money, and getting customer information.

## Usage

- **Creating an Account**: The client can create a new account by providing account details to the `BankFacade`.
- **Depositing Money**: The client can deposit money into an account by calling the `deposit` method of the `BankFacade`.
- **Withdrawing Money**: The client can withdraw money from an account by calling the `withdraw` method of the `BankFacade`.
- **Getting Customer Information**: The client can retrieve customer information by calling the `getCustomerName` method of the `BankFacade`.

By using the `BankFacade`, client classes interact with the banking system through a simplified interface, without needing to understand the complexities of managing accounts and customers directly. This promotes simplicity, reduces coupling, and improves maintainability of the banking system.

