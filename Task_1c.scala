// Load the input data and split each line into an array of strings
val vgdataLines = sc.textFile("hdfs:///user/ashhall1616/bdc_data/assignment/t1/vgsales-small.csv")
val vgdata = vgdataLines.map(_.split(";"))

// Task 1c:
// TODO: *** Put your solution here ***



// Required to exit the spark-shell
sys.exit(0)