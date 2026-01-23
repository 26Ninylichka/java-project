CREATE TABLE IF NOT EXISTS Movies
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title TEXT NOT NULL,
    release_year INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS Reviews
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    rating INT NOT NULL CHECK ( rating BETWEEN 1 AND  10),
    comment TEXT,
    movie_id UUID NOT NULL REFERENCES Movies(id)
    );

CREATE TABLE IF NOT EXISTS Users
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE
    );

CREATE TABLE IF NOT EXISTS Orders
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    status TEXT NOT NULL,
    user_id UUID NOT NULL REFERENCES Users(id)
    );