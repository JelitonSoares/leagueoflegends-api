CREATE TABLE skills (
id BINARY(16) NOT NULL,
skill_name VARCHAR(255) NOT NULL,
skill_description VARCHAR(255) NOT NULL,
skill_type VARCHAR(50) NOT NULL,
skill_image VARCHAR(255) NOT NULL,
skill_video VARCHAR(255) NOT NULL,
champion_id BINARY(16) NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (champion_id) REFERENCES champions(id)

);