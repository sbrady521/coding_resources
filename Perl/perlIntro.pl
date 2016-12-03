#!/usr/bin/perl -w
#the -w flag stands for warnings, it gives you warning when you make errors

=for comment

#Unlike in shell, we need a dollar sign to set variables aswell as get the value
$a="Just a string";
print "$a\n";

#getting input
print "Enter x: ";
$x = <STDIN>;
#chomp strips the new line character from the end of a line
chomp $x;
print "Enter y: ";
$y = <STDIN>;
chomp $y;
#perl automatically converts strings to numbers if your doing arithmetic
$ans = $y * $x;
print "$ans\n";

#processing input
while ($line = <STDIN>){
    print $line;
}

#emmiting the stream will behave like in shell
#if arguments are given then the stream becomes the files passed in
#if nothing is passed in it reads from STDIN by default
while ($line = <>){
    print $line;
}

#perl has a built in function line sed, syntax s/[regex]/[replacement string]/g
while ($line = <STDIN>){
    chomp $line;
    #this says do a regex compare and ignore case
    if($line =~ /quit/i){
        #last is the same as break
        last;
    }
    #this line will remove anything in the input that isnt a number
    $line =~ s/[^0-9]//g;
    $sum += $line;
}

#string comparison
$last_line = "\n";
while ($line = <STDIN>){
    chomp $line;
    #this is how we compare strings in perl
    if ($line eq $last_line){
        print"Snap!!\n";
    }
    $last_line = $line;
}

# a '.' in between 2 strings concatenates them
$x = "Andrew";
$i = 0;
while($i < 10){
    $x = $x.$x;
    $i++;
}
print $x, "\n";
print length $x, "\n"; #length tells you the length of a string

#ARRAYS
#we dont have to initiate arrays, we can simply pretend it was already created
#perl does everything behind the scenes
#Every element we dont define will be set to ' '
$x[42] = "Andrew";
$x[50] = "rocks";
print "$x[42] $x[50]\n";



$i = 0;
while($line = <STDIN>){
    $array[$i] = $line;
    $i++;
}

print "$i lines read\n";

print "$i lines read which were in reverse";
$j = $#array; #this # identifies the last index, in the array aka the length -1
while($j = >= 0){
    print $array[$j];
    $j--;
}

#the @ is used to identify and array
print @array; #this line prints the whole array


#this fills a list with multiple lines of standard input
@array = <STDIN>;
$i = @array; #this is a scalar context and thus the variable i is assigned the length of array
print "$i lines read, which are:\n";
print @array;

#this demonstrates how to read a file into an array, by manipulating streams
#GOLDEN RULE
#whenever we make a request to the operating system, check it succeeds
if (!open BOOK, "test3.txt"){
    #the die funcion combines, printf STDERR and exit(1)
    die "$0: open failed: $!\n"; #this prints to standard error
    #$! prints out the specific error that occured
    #$0 is the variable for the file name
}

#this doe sthe same as the above section
#'or' can be used instead of ||
open BOOK, "test.txt" or die "$0: open failed: $!\n";

@array = <BOOK>;
print @array;
print "list is ",@array + 0,"long\n"; #All of a sudden the array is in a scalar context and thus array becomes a length

#this creates a backup copy of the old file
$file = "test.txt";
$newFile = "$file.backup";
open NEWBOOK, ">$newFile" or die "$0: open '$newFile' failed: $!\n"
print NEWBOOK @array


#this goes through all arguments in a for loop
foreach $line (@ARGV){
    print $line;
}

@line = <STDIN>;
$n = @length;
#join attaches all elements in an array to a single string using the input
#there is a similar join function in python
$chars = length join("", @lines);
print "$n lines $chars char\n";

open F, "test.txt";
@lines = <F>;
$all = join "", @lines;
print $all;

#back quotes does the exact same as it does in shell
#it evaluates shell commands, e.g. echo/date/cat, we can use all shell commands
$all = `cat test.txt | sort`;
print $all;

#Perl has an index by string system aswell as numbers
#Somewhat similar to the dictionary system in python
$array{"Andrew"} = "Rocks";
print "$array{Andrew}\n"

while ($line = <>){
    $course = $line;
    $course =~ s/\|.*//;
    print "$course\n";
}


#when a variable is not specified in a situation like this, perl operates on the variable _
while(<>){
    s/Hermione/Zaphod/g;
    s/Harry/Hermione/g;
    s/Zaphod/Harry/g;
    print;
}

#WHO TO EXPEL
while($line = <>){
    #retrieve name
    chomp $line;
    $name = $line;
    $name =~ s/,.*//g;
    $name =~ s/"//g;

    #retrieve deductions
    $deduction = $line;
    $name =~ s/"//g;
    $name =~ s/\D//g;

    #put in a hash
    $total_deduction{$name} += $deduction;
}

foreach $n (keys %total_deduction){
    print "$n\t2$total_deduction{$n}\n";
}

#WHO TO EXPEL(Alternate)
while($line = <>){
    #retrieve name and deduction
    chomp $line;
    ($name, $deduction) = $line =~ /"([^"]*)".*"(\d+)/ or warn "a line didn't match\n";

    #put in a hash
    $total_deduction{$name} += $deduction;
}

foreach $n (keys %total_deduction){
    print "$n\t2$total_deduction{$n}\n";
}

#this would be another way to grab name, split is a lot like cut
#this says split up the line by commas and put each field in the array feilds
$line =~ s/"//g
@fields = split /,/, $line;
$name = $fields[0]

#program to extract all numbers from a text
@text = <>;
$s = join "", @text;
@numbers = split /\D+/, $s;
print join ",", "@numbers";

@text = <>;
$s = join "", @text;
@numbers = $s =~ /\d+/g #!!!! this returns a list of all matches to that regex
print join ",", "@numbers";

#this is the same as a prototype
sub andrew;

#defines a function
sub andrew{
    print "Andrew Rocks\n";
}

andrew # will call the function
&andrew # is the same but warns perl that it is a function, as such it does not require prototypes

sub andrew2{
    $n = @_[0]; #all parameters are stored in the array _
    #we should extract our parameters out of _ before using them, to improve readablity and reliability
    $i  = 0;
    while($i < $n){
        print "Andrew Rocks";
    }
}

andrew(42);

#this code produces an infinite loop, as in perl, variables in functions are global, so i gets reset every funciton call
#in perl, every variable is global
#adding my in front of a variable declaration makes it local
$i = 0;
while($i < 42){
    andrew2(5);
    print "yes i do\n";
    $i++;
}

sub andrew3{
    my ($n, $x, $y) = @_;
    print "this is the best way to extract parameters from a function";
}

sub dot_product{
    my @all = @_;
    my @x = @all[0..($#all/2)];
    my @y = @all[($#all/2)..$#all]
    my $i = 0;
    my @z;
    while($i <= $#x){
        $z[$i] = $x[$i] * $y[$i];
        $i++;
    }
    return @z
}

@a = (1..5);
@b = (5..9);
@c = dot_product(@a,@b);

$andrew = 42;
$fred = "andrew";
$c = $$fred
print "c = $c\n"; #c would be 42, we use a variable as a variable name

# \@a - means the pointer to a, we can pass values by reference if we pass in \@a

sub dot_product{
    my ($x, $y) = @_;
    my @z;
    my $i = 0;
    while($i <= $#$x){
        $z[$i] = $x -> [$i] * $x -> [$i];
        $i++;
    }
    return $i;
}

@a = (1..5);
@b = (6..9);
@c = dot_product(\@a, \@b);
=cut
sub return_selected(&@){
  my ($code, @list) = @_;
  my @selected;
  print STDERR "code = $code\n";
  foreach $x (@list){
    $_ = $x;
    if (&$code){
      push @selected, $x;
    }
  }
  return @selected;
}

@numbers = 1..20;
@odd = return_selected {$_ % 2} @numbers;
@odd = grep {$_ % 2} @numbers;
print "odd\n";

#demonstation of grep
#this only prints lines with numbers
@lines = <>;
@numbers_lines = grep /\d+/, @lines;
print @numbers_lines;
