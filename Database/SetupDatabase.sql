DROP TABLE IF EXISTS player;

CREATE TABLE player(
id int NOT NULL GENERATED ALWAYS AS IDENTITY,
name varchar(50) NOT NULL,
mail varchar NOT NULL,
passwordHash varchar NOT NULL);

ALTER TABLE player ADD CONSTRAINT unique_player_name UNIQUE (name);
ALTER TABLE player ADD CONSTRAINT unique_player_mail UNIQUE (mail);