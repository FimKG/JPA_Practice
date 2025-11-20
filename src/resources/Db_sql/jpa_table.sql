
-- CREATE TABLE `jpa_db`.`jpa_table` (
--     user_id SERIAL PRIMARY KEY,
--     username VARCHAR(50) UNIQUE NOT NULL,
--     email VARCHAR(100) UNIQUE NOT NULL,
--     password_hash VARCHAR(255) NOT NULL,
--     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
-- );

-- INSERT INTO jpa_table (username, email, password_hash)
-- VALUES
--     ('kgaugelo_dev', 'kgaugelo@example.com', 'hashed_password_123'),
--     ('qa_master', 'qa.master@example.com', 'secure_hash_456'),
--     ('spring_booter', 'spring.booter@example.com', 'encrypted_pass_789');

-- select * from jpa_table;

-- SELECT user, host 
-- FROM jpa_db.user 
-- WHERE user = 'root_user';

CREATE USER 'root_user'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON jpa_db.* TO 'root_user'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
