CREATE TABLE champions (
id CHAR(36) DEFAULT (UUID()),
champ_name VARCHAR(255) NOT NULL, 
champ_lore VARCHAR(255) NOT NULL,
champ_role VARCHAR(50) NOT NULL,
champ_difficulty VARCHAR(50) NOT NULL,
champ_lane VARCHAR(50) NOT NULL,
champ_release DATE NOT NULL,
champ_image VARCHAR(255) NOT NULL,
PRIMARY KEY (id));

INSERT INTO champions (champ_name, champ_lore, champ_role, champ_difficulty, champ_lane, champ_release, champ_image) VALUES (
'Aatrox a espada darkin', 'Antes defensores honrados de Shurima contra o temido Vazio, Aatrox e seus irmãos acabaram se tornando uma ameaça ainda maior para Runeterra, e a única coisa capaz de derrotá-los foi um tipo de feitiçaria mortal e traiçoeira. Mas após séculos de...',
'LUTADOR', 'MEDIUM', 'TOP', '2013-06-13', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg'); 

SELECT * FROM champions;


CREATE TABLE skills (
id CHAR(36) DEFAULT (UUID()),
skill_name VARCHAR(255) NOT NULL, 
skill_description VARCHAR(255) NOT NULL,
skill_type VARCHAR(50) NOT NULL,
skill_image VARCHAR(255) NOT NULL,
skill_video VARCHAR(255) NOT NULL,
PRIMARY KEY (id));

ALTER TABLE skills ADD COLUMN champion_id CHAR(36) NOT NULL;
ALTER TABLE skills ADD CONSTRAINT fk_champion FOREIGN KEY ( champion_id ) REFERENCES champions ( id );


INSERT INTO skills (
skill_name, skill_description, skill_type, skill_image, skill_video, champion_id) VALUES (
'Postura do Arauto da Morte', 'Periodicamente, o próximo ataque básico de Aatrox causa Dano Físico adicional e o cura com base na Vida máxima do alvo.',
'PASSIVA', 'https://ddragon.leagueoflegends.com/cdn/14.12.1/img/passive/Aatrox_Passive.png', 'https://d28xe8vt774jo5.cloudfront.net/champion-abilities/0266/ability_0266_P1.mp4',
'12add752-3d83-11ef-8c6a-0250f4da9153');

SELECT s.skill_name, s.skill_description, c.champ_short_name FROM skills AS s JOIN champions AS c WHERE c.champ_short_name = 'AATROX';

CREATE DATABASE apilol_db;



CREATE TABLE champions (
id CHAR(36) DEFAULT (UUID()),
champ_short_name VARCHAR(255) NOT NULL,
champ_long_name VARCHAR(255) NOT NULL,
champ_lore VARCHAR(255) NOT NULL,
champ_role VARCHAR(50) NOT NULL,
champ_difficulty VARCHAR(50) NOT NULL,
champ_lane VARCHAR(50) NOT NULL,
champ_release DATE NOT NULL,
champ_image VARCHAR(255) NOT NULL,
PRIMARY KEY (id));


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

INSERT INTO champions (champ_short_name, champ_long_name, champ_lore, champ_role, champ_difficulty, champ_lane, champ_release, champ_image) VALUES (
'AATROX', 'AATROX A ESPADA DARKIN', 'Antes defensores honrados de Shurima contra o temido Vazio, Aatrox e seus irmãos acabaram se tornando uma ameaça ainda maior para Runeterra, e a única coisa capaz de derrotá-los foi um tipo de feitiçaria mortal e traiçoeira. Mas após séculos de...',
'LUTADOR', 'MEDIUM', 'TOP', '2013-06-13', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg'); 


INSERT INTO skills (
skill_name, skill_description, skill_type, skill_image, skill_video, champion_id) VALUES (
'Postura do Arauto da Morte', 'Periodicamente, o próximo ataque básico de Aatrox causa Dano Físico adicional e o cura com base na Vida máxima do alvo.',
'PASSIVA', 'https://ddragon.leagueoflegends.com/cdn/14.12.1/img/passive/Aatrox_Passive.png', 'https://d28xe8vt774jo5.cloudfront.net/champion-abilities/0266/ability_0266_P1.mp4',
'3e5ea39d-3c7d-11ef-b0ce-8cb0e92a5ef8');











