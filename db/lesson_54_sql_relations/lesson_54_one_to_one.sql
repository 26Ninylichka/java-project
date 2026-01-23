CREATE TABLE  IF NOT EXISTS Serials
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title TEXT NOT NULL ,
    genre TEXT NOT NULL ,
    release_year INT NOT NULL,
    seasons INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS Serials_keys
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code TEXT NOT NULL UNIQUE,
    serial_id UUID NOT NULL UNIQUE REFERENCES Serials(id)
    );


CREATE TABLE IF NOT EXISTS Viewers
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE

    );

CREATE TABLE IF NOT EXISTS Viewers_keys
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    age INT,
    country TEXT NOT NULL UNIQUE,
    viewer_id UUID NOT NULL UNIQUE REFERENCES Viewers(id)
    );