grammar PropertyFile;


file: prop+ ;

prop: ID '=' STRING '\r'?'\n';


STRING:'"'.*?'"';
ID:[a-z]+ ;
