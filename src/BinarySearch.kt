class BinarySearch {

    fun searchInt(list: List<Int>, target: Int): Int{

        var startIndex: Int = 0
        var endIndex: Int = list.size - 1

        while (startIndex <= endIndex){
            //calculate mid point.
            var mid: Int = (startIndex + endIndex)/2
            //set result to the guessed item.
            var result: Int = list[mid]

            println("start index is: $startIndex")
            println("end index is: $endIndex")
            println("mid is: $mid")
            println("guess is: $result")

            //target found!.
            if (result == target){
                return result
            }
            else if(result < target){
                //if the result is less than the target, "move the start index up" by setting it to be = calculated mid + 1
                startIndex = mid + 1
            } else{
                //if the result is grater than the target, "move the end index down" by setting it to be = calculated mid - 1
                endIndex = mid - 1
            }
        }
        //return -1 when no match is found
        return -1
    }

    fun searchString(list: List<String>, target: String): String{
        var startIndex: Int = 0
        var endIndex: Int = list.size - 1

        while (startIndex <= endIndex){
            //calculate mid point.
            var mid: Int = (startIndex + endIndex)/2
            //set result to the guessed item.
            var result: String = list[mid]

            println("start index is: $startIndex")
            println("end index is: $endIndex")
            println("mid is: $mid")
            println("guess is: $result")

            //target found!.
            if (result == target){
                return result
            }
            else if(result < target){
                //if the result is less than the target, "move the start index up" by setting it to be = calculated mid + 1
                startIndex = mid + 1
            } else{
                //if the result is grater than the target, "move the end index down" by setting it to be = calculated mid - 1
                endIndex = mid - 1
            }
        }
        //return Not Found when no match is found
        return "Not Found!"
    }
}