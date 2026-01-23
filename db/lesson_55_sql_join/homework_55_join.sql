CREATE TABLE IF NOT EXISTS Authors
(
    id   UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Books
(
    id    UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Authors_books
(
    author_id UUID NOT NULL,
    book_id   UUID NOT NULL,

    PRIMARY KEY (author_id, book_id),

    FOREIGN KEY (author_id) REFERENCES authors (id),
    FOREIGN KEY (book_id) REFERENCES books (id)
);

INSERT INTO Authors (name)
VALUES ('King'),
       ('Rowling'),
       ('AuthorWithoutBooks');

INSERT INTO Books (title)
VALUES ('IT'),
       ('Harry Potter'),
       ('BookWithoutAuthor');

INSERT INTO Authors_books (author_id, book_id)
VALUES ((SELECT id FROM authors WHERE name = 'King'),
        (SELECT id FROM books WHERE title = 'IT')),
       ((SELECT id FROM authors WHERE name = 'Rowling'),
        (SELECT id FROM books WHERE title = 'Harry Potter'));

SELECT *
FROM authors
         JOIN authors_books ON authors.id = authors_books.author_id
         JOIN books ON books.id = authors_books.book_id;

SELECT *
FROM authors
         LEFT JOIN authors_books ON authors.id = authors_books.author_id
         LEFT JOIN books ON books.id = authors_books.book_id;

SELECT *
FROM authors
         RIGHT JOIN authors_books ON authors.id = authors_books.author_id
         RIGHT JOIN books ON books.id = authors_books.book_id;


SELECT *
FROM authors
         FULL JOIN authors_books ON authors.id = authors_books.author_id
         FULL JOIN books ON Books.id = authors_books.book_id;
