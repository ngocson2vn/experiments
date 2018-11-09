package main

import (
	"fmt"
	"time"
)

func say(s string, c chan int) {
  fmt.Println(s)
  <-c
  time.Sleep(30 * time.Minute)
}

func main() {
  c := make(chan int, 1)
  for i := 0; i < 10000000; i++ {
    c <- 1
	  go say(fmt.Sprintf("Goroutine #%d", i), c)
  }

  time.Sleep(1 * time.Hour)
}
