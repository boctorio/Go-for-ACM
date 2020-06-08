package main
import "fmt"
func main(){
	var T int
	fmt.Scanln(&T)
	//fmt.Println(T)
	for i := 0;i<T;i++ {
		var s string
		fmt.Scanln(&s)
		//fmt.Print(s)
		length := len(s)
		if length>10{
			fmt.Printf("%c",s[0])
			fmt.Print(length-2)
			fmt.Printf("%c",s[length-1])
		} else{
			fmt.Print(s)
		}
		fmt.Println("")
	}
}
