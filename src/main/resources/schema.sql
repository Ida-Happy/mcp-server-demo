CREATE TABLE mcp_demo.demo_orders_tbl
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    order_id     VARCHAR(255) NOT NULL,
    item_id      VARCHAR(255) NOT NULL,
    item_name    VARCHAR(255) NOT NULL,
    shop_name    VARCHAR(255) NOT NULL,
    purchase_num INT,
    price       INT,
    create_time  DATETIME
);


CREATE TABLE mcp_demo.demo_items_tbl
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    item_id          VARCHAR(255) NOT NULL,
    shop_name         VARCHAR(255),
    item_name        VARCHAR(255),
    item_desc TEXT,
    base_price       INT,
    sale_price       INT,
    tax_rate DOUBLE,
    purchase_flg     BOOLEAN,
    create_time      DATETIME
);

