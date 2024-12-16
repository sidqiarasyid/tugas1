package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
var tasks = mutableListOf<String>()
fun main() {
    println("====To Do List====")
    println("1. Add new tasks")
    println("2. Change a task")
    println("3. Remove a task")
    println("4. Print your tasks")
    println("0. Exit Program")
    var menuChoice = readln().toInt()
    while (menuChoice != 0) {

        when (menuChoice) {
            1 -> addTask()
            2 -> changeTask()
            3 -> removeTask()
            4 -> readTasks()
            else -> println("Invalid Input")
        }
        println("====To Do List====")
        println("1. Add new tasks")
        println("2. Change a task")
        println("3. Remove a task")
        println("4. Print your tasks")
        println("0. Exit Program")
        menuChoice = readln().toInt()
    }
    println("Closing To DO List")

}


fun addTask() {
    println("How many task do you want to add?: ")
    val num = readln().toInt()
    for (i in 1..num){
        println("Add Tasks")
        val taskInput = readln()
        tasks.add(taskInput)
    }
}

fun changeTask() {
    println("What task do you want to change?: ")
    val searchItem = readln()
    println("Enter your changes")
    val change = readln()
    tasks.replaceAll { if (it == searchItem) change else it }
}

fun removeTask(){
    println("What task do you want to remove: ")
    val searchItem = readln()
    tasks.remove(searchItem)
}

fun readTasks(){
    println("Your Tasks")
    for (task in tasks) {
        println(task)
    }
}