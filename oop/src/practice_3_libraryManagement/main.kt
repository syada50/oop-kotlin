package practice_3_libraryManagement

fun main() {
    var library= PublicLibrary()
    library.addBook(Book("Opekkha          ","HUmayun Ahmed",1993))
    library.addBook(Book("Ekatturer dinguli","JAhanara Imam", 1986))
    library.addBook(Book("Cracher cornel   ","Shahaduzzaman",2009))
    println("____All books____:")
    library.viewAllBook()
    println()
    println("Books by author: 'Shahaduzzaman' ")
    library.findBooksByAuthor("Shahaduzzaman")
}