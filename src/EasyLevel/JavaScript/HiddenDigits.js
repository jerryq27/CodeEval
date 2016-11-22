var fs  = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line != "") {
        //do something here
        //console.log(answer_line);
        var numbers = line.match(/\d|[a-j]/g);
        if(numbers != null)
        {
	        for(var i = 0; i < numbers.length; i++)
	        {
	        	if(isNaN(numbers[i]))
	        	{
	        		numbers[i] = numbers[i].charCodeAt(0) - 97;
	        	}
	        }
    	}

        if(numbers == null)		
        	console.log("NONE");	
        else
        	console.log(numbers.join(""));
    }
});