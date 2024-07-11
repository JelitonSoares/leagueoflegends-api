CREATE TABLE champions (
id BINARY(16) NOT NULL ,
champ_short_name VARCHAR(255) NOT NULL,
champ_long_name VARCHAR(255) NOT NULL,
champ_lore VARCHAR(255) NOT NULL,
champ_role VARCHAR(50) NOT NULL,
champ_difficulty VARCHAR(50) NOT NULL,
champ_lane VARCHAR(50) NOT NULL,
champ_release DATE NOT NULL,
champ_image VARCHAR(255) NOT NULL,
PRIMARY KEY (id));