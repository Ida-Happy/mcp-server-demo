INSERT INTO mcp_demo.demo_orders_tbl (id, order_id, item_id, item_name, shop_name, purchase_num, price, create_time)
VALUES (1, 'order1', 'item1', '男士休闲外套', '休闲潮衣店', 1, 150, NOW()),
       (2, 'order1', 'item2', '亲亲虾条', '食品食杂店', 1, 39, NOW()),
       (3, 'order2', 'item2', '亲亲虾条', '食品食杂店', 2, 39, NOW()),
       (4, 'order3', 'item3', '手机保护壳', '3C数码专营店', 3, 25, NOW()),
       (5, 'order4', 'item4', '床单三件套', '时尚家居装饰店', 2, 88, NOW()),
       (6, 'order5', 'item3', '手机保护壳','3C数码专营店', 3, 25, NOW()),
       (7, 'order5', 'item4', '床单三件套', '时尚家居装饰店', 1, 88, NOW()),
       (8, 'order5', 'item5', '休闲运动衣', '休闲潮衣店', 3, 250, NOW()),
       (9, 'order6', 'item6', '女包', '时尚家居装饰店', 3, 290, NOW()),
       (10, 'order6', 'item7', '女士大衣', '休闲潮衣店', 3, 1000, NOW()),
       (11, 'order7', 'item2', '亲亲虾条', '食品食杂店', 3, 39, NOW());

INSERT INTO mcp_demo.demo_items_tbl (id, item_id, shop_name, item_name, item_desc, base_price, sale_price, tax_rate, purchase_flg, create_time)
VALUES (1, 'item1', '休闲潮衣店', '男士休闲外套', '休闲外套, 白色', 100, 150, 0.1, true, NOW()),
       (2, 'item2', '食品食杂店', '亲亲虾条', '亲亲牌虾条, 原味 150g * 6', 19, 39, 0.08, true, NOW()),
       (3, 'item3', '3C数码专营店', '手机保护壳', '新款卡通可爱针织手机保护套', 3, 25, 0.1, true, NOW()),
       (4, 'item4', '时尚家居装饰店', '床单三件套', '加厚全棉老粗布床单三件套', 22, 88, 0.1, true, NOW()),
       (5, 'item5', '休闲潮衣店', '休闲运动衣', '休闲运动衣, 白色', 100, 250, 0.1, true, NOW()),
       (6, 'item6', '时尚家居装饰店', '女包', '植绒女包', 100, 290, 0.08, true, NOW()),
       (7, 'item7', '休闲潮衣店', '女士大衣', '棕色大衣', 200, 1000, 0.1, true, NOW()),
       (8, 'item8', '休闲潮衣店', '气质冲锋衣', '冲锋衣', null, null, null, false, NOW()),
       (9, 'item9', '时尚家居装饰店', '可爱陶瓷水杯', '水杯', null, null, null, false, NOW()),
       (10, 'item10', '3C数码专营店', '品牌手机', '手机', null, null, null, false, NOW()),
       (11, 'item11', '食品食杂店', '螺蛳粉', '螺蛳粉', null, null, null, false, NOW());

