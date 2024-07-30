f = open("bookData.txt", "r", encoding = "utf-8")
bookLists = f.readlines()
for bookList in bookLists : 
    print(bookList)

fw = open("bookData.txt", "w", encoding="utf-8")