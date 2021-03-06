--
-- xram_block.vhd
--
-- Generated by BlockGen
-- Tue Apr 29 14:42:30 CEST 2014
--
-- This module will synthesize on Spartan2/2E and Virtex/E devices.
--

library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.std_logic_arith.all;
use IEEE.std_logic_unsigned.all;
library unisim;
use unisim.vcomponents.all;

entity xram_block is
	port (
		a_rst  : in std_logic;
		a_clk  : in std_logic;
		a_en   : in std_logic;
		a_wr   : in std_logic;
		a_addr : in std_logic_vector(7 downto 0);
		a_din  : in std_logic_vector(31 downto 0);
		a_dout : out std_logic_vector(31 downto 0);
		b_rst  : in std_logic;
		b_clk  : in std_logic;
		b_en   : in std_logic;
		b_wr   : in std_logic;
		b_addr : in std_logic_vector(7 downto 0);
		b_din  : in std_logic_vector(31 downto 0);
		b_dout : out std_logic_vector(31 downto 0)
	);
end xram_block;

architecture rtl of xram_block is

	component RAMB4_S16_S16
		port (
			DIA    : in std_logic_vector (15 downto 0);
			DIB    : in std_logic_vector (15 downto 0);
			ENA    : in std_logic;
			ENB    : in std_logic;
			WEA    : in std_logic;
			WEB    : in std_logic;
			RSTA   : in std_logic;
			RSTB   : in std_logic;
			CLKA   : in std_logic;
			CLKB   : in std_logic;
			ADDRA  : in std_logic_vector (7 downto 0);
			ADDRB  : in std_logic_vector (7 downto 0);
			DOA    : out std_logic_vector (15 downto 0);
			DOB    : out std_logic_vector (15 downto 0)
		); 
	end component;

	attribute INIT: string;
	attribute INIT_00: string;
	attribute INIT_01: string;
	attribute INIT_02: string;
	attribute INIT_03: string;
	attribute INIT_04: string;
	attribute INIT_05: string;
	attribute INIT_06: string;
	attribute INIT_07: string;
	attribute INIT_08: string;
	attribute INIT_09: string;
	attribute INIT_0a: string;
	attribute INIT_0b: string;
	attribute INIT_0c: string;
	attribute INIT_0d: string;
	attribute INIT_0e: string;
	attribute INIT_0f: string;

	attribute INIT_00 of cmp_ram_0: label is "0000000000000000000000000000000000000000000000000000000000000000";
	attribute INIT_01 of cmp_ram_0: label is "5678567856785678567856785678567856780000000000000000000000000000";
	attribute INIT_02 of cmp_ram_0: label is "001fff8400050003000600ff00010008ff910002ff9000040000ff87ff860040";
	attribute INIT_03 of cmp_ram_0: label is "0000db1b56785678567856785678567856780020003f0000ff85ff80ffffffff";
	attribute INIT_04 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_05 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_06 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_07 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_08 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_09 of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0a of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0b of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0c of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0d of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0e of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";
	attribute INIT_0f of cmp_ram_0: label is "5678567856785678567856785678567856785678567856785678567856785678";

	attribute INIT_00 of cmp_ram_1: label is "0000000000000000000000000000000000000000000000000000000000000000";
	attribute INIT_01 of cmp_ram_1: label is "1234123412341234123412341234123412340000000000000000000000000000";
	attribute INIT_02 of cmp_ram_1: label is "0000ffff000000000000000000000000ffff0000ffff00000000ffffffff0000";
	attribute INIT_03 of cmp_ram_1: label is "000001321234123412341234123412341234000000008000ffffffff0000ffff";
	attribute INIT_04 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_05 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_06 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_07 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_08 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_09 of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0a of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0b of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0c of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0d of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0e of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";
	attribute INIT_0f of cmp_ram_1: label is "1234123412341234123412341234123412341234123412341234123412341234";

begin

	cmp_ram_0 : RAMB4_S16_S16
		port map (
			WEA => a_wr,
			WEB => b_wr,
			ENA => a_en,
			ENB => b_en,
			RSTA => a_rst,
			RSTB => b_rst,
			CLKA => a_clk,
			CLKB => b_clk,
			DIA => a_din(15 downto 0),
			ADDRA => a_addr,
			DOA => a_dout(15 downto 0),
			DIB => b_din(15 downto 0),
			ADDRB => b_addr,
			DOB => b_dout(15 downto 0)
		);

	cmp_ram_1 : RAMB4_S16_S16
		port map (
			WEA => a_wr,
			WEB => b_wr,
			ENA => a_en,
			ENB => b_en,
			RSTA => a_rst,
			RSTB => b_rst,
			CLKA => a_clk,
			CLKB => b_clk,
			DIA => a_din(31 downto 16),
			ADDRA => a_addr,
			DOA => a_dout(31 downto 16),
			DIB => b_din(31 downto 16),
			ADDRB => b_addr,
			DOB => b_dout(31 downto 16)
		);

end rtl;
