
CREATE TABLE IF NOT EXISTS auth
(
    id        BIGINT PRIMARY KEY AUTO_INCREMENT,
    username  VARCHAR(255) NOT NULL,
    password  VARCHAR(255) NOT NULL
);

INSERT INTO auth (username, password) VALUES ('admin', '$2a$12$COz8v/BUQdDKmw/bvwHyXe1LA1fP58DBzOH1KZmtqE3C02OcvX2dW');