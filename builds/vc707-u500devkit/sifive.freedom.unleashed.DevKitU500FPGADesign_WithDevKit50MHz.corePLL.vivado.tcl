create_ip -name clk_wiz -vendor xilinx.com -library ip -module_name \
 corePLL -dir $ipdir -force
set_property -dict [list \
 CONFIG.CLK_IN1_BOARD_INTERFACE {Custom} \
 CONFIG.PRIM_SOURCE {No_buffer} \
 CONFIG.NUM_OUT_CLKS {1} \
 CONFIG.PRIM_IN_FREQ {200.0} \
 CONFIG.CLKIN1_JITTER_PS {50.0} \
 CONFIG.CLKOUT1_USED {true} \
 CONFIG.CLKOUT2_USED {false} \
 CONFIG.CLKOUT3_USED {false} \
 CONFIG.CLKOUT4_USED {false} \
 CONFIG.CLKOUT5_USED {false} \
 CONFIG.CLKOUT6_USED {false} \
 CONFIG.CLKOUT7_USED {false} \
 CONFIG.CLKOUT1_REQUESTED_OUT_FREQ {50.0} \
 CONFIG.CLKOUT1_REQUESTED_PHASE {0.0} \
 CONFIG.CLKOUT1_REQUESTED_DUTY_CYCLE {50.0} \
] [get_ips corePLL]
set mult [get_property CONFIG.MMCM_CLKFBOUT_MULT_F [get_ips corePLL]]
set div1 [get_property CONFIG.MMCM_DIVCLK_DIVIDE [get_ips corePLL]]
set jitter [get_property CONFIG.CLKOUT1_JITTER [get_ips corePLL]]
if {$jitter > 300.0} {
  puts "Output jitter $jitter ps exceeds required limit of 300.0"
  exit 1
}
set phase [get_property CONFIG.MMCM_CLKOUT0_PHASE [get_ips corePLL]]
if {$phase < -5.0 || $phase > 5.0} {
  puts "Achieved phase $phase degrees is outside tolerated range -5.0-5.0"
  exit 1
}
set div2 [get_property CONFIG.MMCM_CLKOUT0_DIVIDE_F [get_ips corePLL]]
set freq [expr { 200.0 * $mult / $div1 / $div2 }]
if {$freq < 49.5 || $freq > 50.5} {
  puts "Achieved frequency $freq MHz is outside tolerated range 49.5-50.5"
  exit 1
}
puts "Achieve frequency $freq MHz phase $phase degrees jitter $jitter ps"
