require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-base64"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = <<-DESC
                    react-native-base64
                    DESC
  # brief license entry:
  s.source       = { :git => "https://github.com/romualdpercereau/react-native-base64.git", :tag => "#{s.version}" }
  s.homepage     = "https://github.com/github_account/react-native-base64"
  s.license      = "MIT"
  # optional - use expanded license entry instead:
  # s.license    = { :type => "MIT", :file => "LICENSE" }
  s.authors      = { "Romuald Percereau" => "none@romuald.fr" }
  s.platforms    = { :ios => "9.0" }

  s.source_files = "ios/**/*.{h,c,m,swift}"
  s.requires_arc = true

  s.dependency "React"
  # ...
  # s.dependency "..."
end

