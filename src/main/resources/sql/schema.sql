CREATE TABLE IF NOT EXISTS members
(
    id                     VARCHAR DEFAULT RANDOM_UUID() PRIMARY KEY,
    firstname              VARCHAR      NOT NULL,
    lastname               VARCHAR      NOT NULL
);