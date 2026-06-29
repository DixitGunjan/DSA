CREATE TABLE Customers (
                           customer_id INT PRIMARY KEY,
                           first_name VARCHAR(50),
                           last_name VARCHAR(50),
                           age INT,
                           country VARCHAR(50)
);

INSERT INTO Customers (customer_id, first_name, last_name, age, country)
VALUES
    (1, 'John', 'Doe', 31, 'USA'),
    (2, 'Robert', 'Luna', 22, 'USA'),
    (3, 'David', 'Robinson', 22, 'UK'),
    (4, 'John', 'Reinhardt', 25, 'UK'),
    (5, 'Betty', 'Doe', 28, 'UAE');

CREATE TABLE Orders (
                        order_id INT PRIMARY KEY,
                        item VARCHAR(100),
                        amount DECIMAL(10,2),
                        customer_id INT,
                        FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

INSERT INTO Orders (order_id, item, amount, customer_id)
VALUES
    (1, 'Keyboard', 400, 4),
    (2, 'Mouse', 300, 4),
    (3, 'Monitor', 12000, 3),
    (4, 'Keyboard', 400, 1),
    (5, 'Mousepad', 250, 2);

CREATE TABLE Shippings (
                           shipping_id INT PRIMARY KEY,
                           status VARCHAR(20),
                           customer INT,
                           FOREIGN KEY (customer) REFERENCES Customers(customer_id)
);

INSERT INTO Shippings (shipping_id, status, customer)
VALUES
    (1, 'Pending', 2),
    (2, 'Pending', 4),
    (3, 'Delivered', 3),
    (4, 'Pending', 5),
    (5, 'Delivered', 1);



##Problems

select * from Customers where country ='USA';

select * from Orders where amount>300;

select CONCAT(first_name, ' ', last_name)  AS full_name from Customers;

select * from Customers where first_name = 'John';

select * from Shippings where status ='Pending';

select country , count(*) from Customers GROUP BY country;

