// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System

let EratoEstructurada n =
    let mutable x = n
    while(x > 1) do
        let mutable esprimo = true
        for i in 2 .. x do
            if (x % i = 0) then
                esprimo <- false
        if (esprimo) then
            printfn"%i" x
        x <- x - 1

let rec EratoRecursivo n =
    if (n > 1) then
        let mutable x = n
        let mutable esprimo = true
        for i in 2 .. x do
            if (x % i = 0) then
                EratoRecursivo(x - 1)
                esprimo <- false
        if (esprimo) then
            EratoRecursivo(x - 1)
            printfn"%i" x
        
        
[<EntryPoint>]
let main argv = 
    printfn "%A" "Criba Estructurada"
    let n = Console.ReadLine()|> int
    EratoEstructurada(n)
    printfn "%A" "Criba Recursiva"
    let n = Console.ReadLine()|> int
    EratoRecursivo(n)
    let temp = Console.ReadKey()
    0 // devolver un código de salida entero
