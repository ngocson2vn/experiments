package main

import (
	"fmt"
	"time"
)

func say(s string) {
  fmt.Println(s)
  time.Sleep(30 * time.Minute)
}

func main() {
  go say("Goroutine #0")
  time.Sleep(5 * time.Minute)
}
