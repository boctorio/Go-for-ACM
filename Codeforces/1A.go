package main
import "fmt"
func main() {
	var a,b,c int64
	fmt.Scan(&a,&b,&c)
	ans := ((a+c-1)/c)*((b+c-1)/c)
	fmt.Println(ans)
}
