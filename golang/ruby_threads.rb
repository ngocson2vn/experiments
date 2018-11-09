#/usr/bin/env ruby

for i in 0..1000000
  Thread.new() { sleep(3600) }
  puts "Created thread ##{i}"
end

