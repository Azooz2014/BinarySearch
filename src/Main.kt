fun main(){
    val binarySearch: BinarySearch = BinarySearch()

    val testIntList: List<Int> = randomIntList(0,1000)

    val testStringList: List<String> = listOf("a","b","c","d")

//    testList.sorted().forEach { println(it) }

//    println(binarySearch.searchInt(list = testIntList.sorted(), target = 50))

    println(binarySearch.searchString(testStringList, "fjkajsfakslj"))
}