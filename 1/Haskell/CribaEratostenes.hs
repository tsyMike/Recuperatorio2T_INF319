eratos :: Integer -> Integer
eratos 0 = return()
eratos 1 = return()
eratos n = 
    if n > 1 then
        print(primo 2 n)

primo i n =
    if i <= n then
        if (n % i == 0) then
            eratos(n - 1)
            return ()
        return n
        primo (i + 1) n

main = do
    putStrLn "Criba Recursiva"
    input <- getLine
    let temp = (read input :: Int)
    eratos temp