CREATE DATABASE IF NOT EXISTS cats_db;

USE cats_db;

DROP TABLE IF EXISTS cats;

CREATE TABLE cats (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    cat_name VARCHAR(50) NOT NULL DEFAULT '',
    age INT UNSIGNED,
    PRIMARY KEY (id)
);
