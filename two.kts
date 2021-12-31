println("two.kts")

println("args = ${args.toList()}")

val msg = args[0]
println("$msg  ** ${msg.startsWith("chore")}")
if (!msg.startsWith("feat") || !msg.startsWith("fix") ||
    !msg.startsWith("chore")
) {
    throw RuntimeException("commit message is wrong")
}