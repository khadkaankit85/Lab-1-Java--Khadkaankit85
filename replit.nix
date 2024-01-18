{ pkgs }: {
    deps = [
      pkgs.wl-clipboard-x11
      pkgs.openssh
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}