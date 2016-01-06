package main

import "fmt"
import "log"
import "bufio"
import "os"
import "strconv"

func main() {
    file, err := os.Open(os.Args[1])
    if err != nil {
        log.Fatal(err)
    }   
    defer file.Close()
    scanner := bufio.NewScanner(file)
    for scanner.Scan() {
        printFib(scanner.Text())
    }   
}

func printFib(numberString string) {
    newInt, _ := strconv.ParseInt(numberString, 0, 64)
    forInt := int(newInt)
    if forInt == 0 {
        fmt.Println(forInt)
        return
    }
    
    prev := 0
    curr := 1
    next := curr + prev
    forInt -= 1 //Initializing these variables is one iteration.
    for i := 0; i < forInt; i++ {
        prev = curr
        curr = next
        next = curr + prev  
    }
    fmt.Println(curr)
}