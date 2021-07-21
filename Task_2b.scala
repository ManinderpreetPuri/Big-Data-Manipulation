// Load the input data and split each line into an array of strings
val twitterLines = sc.textFile("hdfs:///user/ashhall1616/bdc_data/assignment/t2/twitter-small.tsv")
val twitterdata = twitterLines.map(_.split("\t"))

// Task 2b:
// TODO: *** Put your solution here ***



// Required to exit the spark-shell
sys.exit(0)
