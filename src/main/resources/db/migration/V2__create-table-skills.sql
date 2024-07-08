CREATE TABLE skills (
id CHAR(36) DEFAULT (UUID()),
skill_name VARCHAR(255) NOT NULL,
skill_description VARCHAR(255) NOT NULL,
skill_type VARCHAR(50) NOT NULL,
skill_image VARCHAR(255) NOT NULL,
skill_video VARCHAR(255) NOT NULL,
champion_id CHAR(36) NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (champion_id) REFERENCES champions(id)

);