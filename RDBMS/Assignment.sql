#Question 1
#Yields the number of copies of 'The Lost Tribe' that are owned by the Sharpstown library branch.
SELECT title, noOfCopies FROM tbl_book as b
	INNER JOIN
(SELECT lb.branchId, bookId, noOfCopies, branchName, branchAddress FROM tbl_book_copies as bc
	INNER JOIN tbl_library_branch as lb ON lb.branchId = bc.branchId
    WHERE lb.branchName = 'Sharpstown') as lbc
	ON b.bookId = lbc.bookId
	WHERE b.title = 'The Lost Tribe';


#Question 2
#Yields the number of copies of 'The Lost Tribe' owned by each library branch.
SELECT branchName, noOfCopies FROM tbl_library_branch
INNER JOIN
(SELECT tbl_book.bookId, branchId, noOfCopies, title FROM tbl_book_copies
	INNER JOIN
	tbl_book ON tbl_book.bookId = tbl_book_copies.bookId
	WHERE title LIKE 'The Lost Tribe') as info
ON tbl_library_branch.branchId = info.branchId;


#Question 3
#Yields the names of all borrowers who do not have any books checked out.
SELECT name from tbl_borrower
	WHERE name NOT IN (SELECT tbl_borrower.name FROM tbl_book_loans
	INNER JOIN tbl_borrower ON tbl_borrower.cardNo = tbl_book_loans.cardNo);
    
    
#Question 4
#Yields the book title, the borrower's name, and the borrower'saddress of each book that has been borrowed from Sharpstown, whose due date is today. 
SELECT info.title, tbl_borrower.name, tbl_borrower.address FROM tbl_borrower 
INNER JOIN 
(SELECT title, tbl_book.bookId, cardNo FROM tbl_book
	INNER JOIN 
	(SELECT bookId, bl.branchId, cardNo, dateOut, dueDate FROM tbl_book_loans as bl
		INNER JOIN 
		(SELECT branchId FROM tbl_library_branch WHERE
		branchName = 'Sharpstown') as sharpstownId 
        ON sharpstownId.branchId = bl.branchId
        WHERE date(bl.dueDate) = current_date) as sharpstownBooks
	ON tbl_book.bookId = sharpstownBooks.bookId) as info
ON info.cardNo = tbl_borrower.cardNo;

#Question 5
#Yields name and number of books loaned by every library branch.
SELECT branchName, count(branchName) as numOfBooksLoaned FROM tbl_book_loans  as bl
INNER JOIN
tbl_library_branch as lb ON lb.branchId = bl.branchId
GROUP BY branchName;

#Question 6
#Yields name, address and number of books of borrowers whom have borrowed more than 5 books.
SELECT name, address, numOfbooks FROM tbl_borrower 
INNER JOIN 
(SELECT count(cardNo) AS numOfBooks, cardNo FROM tbl_book_loans
GROUP BY cardNo) AS moreThanFive 
ON tbl_borrower.cardNo = moreThanFive.cardNo
WHERE numOfBooks > 5;

#Question 7
#Yields the title and number of copies for all books authored or co-authored by Stephen King, owned by the library branch Central.
SELECT title, noOfCopies FROM tbl_library_branch 
INNER JOIN
(SELECT tbl_book_copies.bookId, branchId, noOfCopies, title, authorName FROM tbl_book_copies 
	INNER JOIN
	(select title, bookId, authorName from tbl_book 
		INNER JOIN
		tbl_author ON tbl_author.authorId = tbl_book.authId
		WHERE authorName LIKE '%Stephen King%') as skBooks
	ON skBooks.bookId = tbl_book_copies.bookId) as info
ON tbl_library_branch.branchId = info.branchId
WHERE tbl_library_branch.branchName LIKE 'Central';
