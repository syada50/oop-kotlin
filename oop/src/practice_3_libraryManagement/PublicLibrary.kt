package practice_3_libraryManagement

class PublicLibrary:Library() {
    private val books = mutableListOf<Book>()
    override fun addBook(book: Book) {
        books.add(book)
    }
    override fun viewAllBook() {
        for (book in books){
            print("Title :${book.title}")
            print("       Author :${book.author}")
            println("     Year:${book.year}")
        }
    }

    override fun findBooksByAuthor(author: String) {
        for (book in books){
            if (book.author == author){
                println("Title:${book.title}")
                println("Author:${book.author}")
                println("Year:${book.year}")

            }
        }
    }
}