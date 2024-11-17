--[[
HATS:
https://www.roblox.com/catalog/376527350/Black-Ponytail
https://www.roblox.com/catalog/3814474927/Cool-Side-Shave
https://www.roblox.com/catalog/63690008/Pal-Hair
https://www.roblox.com/catalog/62234425/Brown-Hair
https://www.roblox.com/catalog/376524487/Blonde-Spiked-Hair
Get this hair from the bundle below https://www.roblox.com/catalog/4637254498/Classic-Male-v2-Hair
https://www.roblox.com/bundles/605/Dennis
]]--
--Thank you to Hat Orbit scipt for some of the functions

loadstring(game:HttpGet(('https://pastebin.com/raw/XTmMzATJ'),true))()

wait(0.5)

game:GetService("RunService").Stepped:Connect(function()
   setsimulationradius(9e9,9e9)
   plr.ReplicationFocus = workspace
   settings().Physics.AllowSleep = false
end)


local unanchoredparts = {}
  local movers = {}
  local tog = true
  local move = false
  local Player = game:GetService("Players").LocalPlayer
  local Character = Player.Character
  local mov = {};
  local mov2 = {};

  local Hats = {Ex1  = Character:WaitForChild("MessyHair"), 
        Ex2  = Character:WaitForChild("Pal Hair"),
        Ex3  = Character:WaitForChild("Hat1"),
        Ex4  = Character:WaitForChild("Hair"),
        Ex5  = Character:WaitForChild("SidePonytail"),
        Ex6  = Character:WaitForChild("HairAccessory"),
  }


  

  for i,v in next, Hats do
   v.Handle.AccessoryWeld:Remove()
   for _,mesh in next, v:GetDescendants() do
    if mesh:IsA("Mesh") or mesh:IsA("SpecialMesh") then 
     mesh:Remove()
    end
   end
  end

  function ftp(str)
   local pt = {};
   if str ~= 'me' and str ~= 'random' then
    for i, v in pairs(game.Players:GetPlayers()) do
     if v.Name:lower():find(str:lower()) then
      table.insert(pt, v);
     end
    end
   elseif str == 'me' then
    table.insert(pt, plr);
   elseif str == 'random' then
    table.insert(pt, game.Players:GetPlayers()[math.random(1, #game.Players:GetPlayers())]);
   end
   return pt;
  end

  local function align(i,v)
   local att0 = Instance.new("Attachment", i)
   att0.Position = Vector3.new(0,0,0)
   local att1 = Instance.new("Attachment", v)
   att1.Position = Vector3.new(0,0,0)
   local AP = Instance.new("AlignPosition", i)
   AP.Attachment0 = att0
   AP.Attachment1 = att1
   AP.RigidityEnabled = true
   AP.ReactionForceEnabled = true
   AP.ApplyAtCenterOfMass = false
   AP.MaxForce = 9999999
   AP.MaxVelocity = math.huge
   AP.Responsiveness = 65
   local AO = Instance.new("AlignOrientation", i)
   AO.Attachment0 = att0
   AO.Attachment1 = att1
   AO.ReactionTorqueEnabled = false
   AO.PrimaryAxisOnly = false
   AO.MaxTorque = 9999999
   AO.MaxAngularVelocity = math.huge
   AO.Responsiveness = 50
  end




  align(Hats.Ex1.Handle, Character["Torso"])
  align(Hats.Ex2.Handle, Character["Left Leg"])
  align(Hats.Ex3.Handle, Character["Right Leg"])
  align(Hats.Ex4.Handle, Character["Left Leg"])
  align(Hats.Ex5.Handle, Character["Right Leg"])


  Hats.Ex1.Handle.Attachment.Rotation = Vector3.new(90,0,0)
        Hats.Ex2.Handle.Attachment.Rotation = Vector3.new(70,0,0)
        Hats.Ex3.Handle.Attachment.Rotation = Vector3.new(70,0,0)
        Hats.Ex4.Handle.Attachment.Rotation = Vector3.new(0,0,0)
        Hats.Ex5.Handle.Attachment.Rotation = Vector3.new(0,0,0)


  Character:WaitForChild("Torso"):FindFirstChild("Attachment").Name = "Attachment1" 
     Character:WaitForChild("Left Leg"):FindFirstChild("Attachment").Name = "Attachment3"
     Character:WaitForChild("Right Leg"):FindFirstChild("Attachment").Name = "Attachment4"
     Character:WaitForChild("Left Leg"):FindFirstChild("Attachment").Name = "Attachment5"
     Character:WaitForChild("Right Leg"):FindFirstChild("Attachment").Name = "Attachment6"
     Character:WaitForChild("Humanoid").HipHeight = 1.8


        Character:WaitForChild("Torso").Attachment1.Position = Vector3.new(-0, 0, 0.3) 
  Character:WaitForChild("Left Leg").Attachment3.Position = Vector3.new(-0, -1.5, -0.3)
  Character:WaitForChild("Right Leg").Attachment4.Position = Vector3.new(0, -1.5, -0.3)
  Character:WaitForChild("Left Leg").Attachment5.Position = Vector3.new(-0, -2.3, -1.1)
  Character:WaitForChild("Right Leg").Attachment6.Position = Vector3.new(-0, -2.3, -1.1)



  
