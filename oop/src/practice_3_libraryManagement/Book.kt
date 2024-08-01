package practice_3_libraryManagement

data class Book (var title: String, var author: String ,var year: Int)    //data class is basically a model class where we ca put primary constractor
    abstract class Library{
        abstract fun addBook(book: Book) //book is an object here
        abstract fun viewAllBook()
        abstract fun findBooksByAuthor(author: String)
    }
