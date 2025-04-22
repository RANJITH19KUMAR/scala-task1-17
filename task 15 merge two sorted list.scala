object MergeSortedLists {
  def mergeSortedLists[A](list1: List[A], list2: List[A])(implicit ord: Ordering[A]): List[A] = {
    (list1, list2) match {
      case (Nil, _) => list2
      case (_, Nil) => list1
      case (h1 :: t1, h2 :: t2) =>
        if (ord.lteq(h1, h2)) h1 :: mergeSortedLists(t1, list2)
        else h2 :: mergeSortedLists(list1, t2)
    }
  }

  def main(args: Array[String]): Unit = {
    val sortedList1 = List(1, 3, 5, 7)
    val sortedList2 = List(2, 4, 6, 8)

    val mergedList = mergeSortedLists(sortedList1, sortedList2)

    println("Merged Sorted List:")
    println(mergedList)
  }
}
