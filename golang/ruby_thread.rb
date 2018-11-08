#/usr/bin/env ruby

t1 = Thread.new { while true ; end }
t2 = Thread.new { while true ; end }
t1.join
t2.join
